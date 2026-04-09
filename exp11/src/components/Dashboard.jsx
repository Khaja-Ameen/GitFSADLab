import { Link } from "react-router-dom";

function Dashboard() {
  return (
    <div className="container">
      <h1>Dashboard</h1>

      <Link to="/local-users">
        <button>Local Users</button>
      </Link>

      <Link to="/users-api">
        <button>Users API</button>
      </Link>

      <Link to="/fake-posts">
        <button>Fake API Posts</button>
      </Link>
    </div>
  );
}

export default Dashboard;