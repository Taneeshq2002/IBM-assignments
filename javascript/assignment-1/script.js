let tasks = [];
let form = document.getElementById("todo-form");
let taskInput = document.getElementById("task");
let passwordInput = document.getElementById("password");
let editId = document.getElementById("edit-id");
let taskList = document.getElementById("task-list");

form.addEventListener("submit", function (e) {
  e.preventDefault();

  const task = taskInput.value.trim();
  const password = passwordInput.value.trim();
  const id = editId.value;

  if (task === "" || password.length < 4) {
    alert("Please enter a task and a valid password (min 4 characters)");
    return;
  }

  if (id) {
    // Editing existing task: check password
    if (tasks[id].password === password) {
      tasks[id].task = task;
      alert("Task updated successfully!");
    } else {
      alert("Incorrect password. Cannot update the task.");
      return;
    }
    editId.value = "";
  } else {
    // Creating new task
    tasks.push({ task, password });
  }

  taskInput.value = "";
  passwordInput.value = "";
  renderTasks();
});

function renderTasks() {
  taskList.innerHTML = "";
  tasks.forEach((t, index) => {
    const li = document.createElement("li");
    li.innerHTML = `
      ${t.task}
      <div class="list-item">
        <button class="edit" onclick="editTask(${index})">Edit</button>
        <button class="delete" onclick="deleteTask(${index})">Delete</button>
      </div>
    `;
    taskList.appendChild(li);
  });
}

function editTask(id) {
  taskInput.value = tasks[id].task;
  editId.value = id;
}

function deleteTask(id) {
  if (confirm("Are you sure you want to delete this task?")) {
    tasks.splice(id, 1);
    renderTasks();
  }
}
