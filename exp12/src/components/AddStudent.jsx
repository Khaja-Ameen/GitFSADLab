import { useState, useEffect } from "react";
import axios from "axios";

function AddStudent({ selected, refresh }) {
  const [student, setStudent] = useState({
    name: "",
    email: "",
    course: "",
  });

  useEffect(() => {
    if (selected) {
      setStudent(selected);
    }
  }, [selected]);

  const handleChange = (e) => {
    setStudent({ ...student, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (student.id) {
      // Update
      axios
        .put(`http://localhost:8080/students/${student.id}`, student)
        .then(() => refresh())
        .catch((err) => console.log(err));
    } else {
      // Add
      axios
        .post("http://localhost:8080/students", student)
        .then(() => refresh())
        .catch((err) => console.log(err));
    }

    // Clear form
    setStudent({
      name: "",
      email: "",
      course: "",
    });
  };

  return (
    <div>
      <h2>Add / Update Student</h2>

      <form onSubmit={handleSubmit}>
        <input
          name="name"
          placeholder="Name"
          value={student.name}
          onChange={handleChange}
        />
        <br /><br />

        <input
          name="email"
          placeholder="Email"
          value={student.email}
          onChange={handleChange}
        />
        <br /><br />

        <input
          name="course"
          placeholder="Course"
          value={student.course}
          onChange={handleChange}
        />
        <br /><br />

        <button type="submit">
          {student.id ? "Update" : "Add"}
        </button>
      </form>
    </div>
  );
}

export default AddStudent;