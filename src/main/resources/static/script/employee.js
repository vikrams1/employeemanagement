function onDelete(id) {
  if (confirm("Do You Want To Delete?")) {
    location.href = '/deleteemployee?id=' + id;
  }
}