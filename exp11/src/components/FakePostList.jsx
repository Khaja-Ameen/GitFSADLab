import { useEffect, useState } from "react";
import axios from "axios";

function FakePostList() {
  const [posts, setPosts] = useState([]);
  const [filtered, setFiltered] = useState([]);
  const [category, setCategory] = useState("all");

  const fetchData = async () => {
    try {
      const res = await axios.get("https://dummyjson.com/posts");
      setPosts(res.data.posts);
      setFiltered(res.data.posts);
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  const handleFilter = (e) => {
    const value = e.target.value;
    setCategory(value);

    if (value === "all") {
      setFiltered(posts);
    } else {
      setFiltered(posts.filter((post) => post.userId == value));
    }
  };

  return (
    <div className="container">
      <h2>Fake API Posts</h2>

      <button onClick={fetchData}>Refresh</button>

      <select onChange={handleFilter} value={category}>
        <option value="all">All</option>
        <option value="1">User 1</option>
        <option value="2">User 2</option>
        <option value="3">User 3</option>
      </select>

      {filtered.map((post) => (
        <div key={post.id} className="card">
          <p><b>Title:</b> {post.title}</p>
          <p>{post.body}</p>
        </div>
      ))}
    </div>
  );
}

export default FakePostList;