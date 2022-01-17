(function () {
  let btnAddFolder = document.querySelector("#addFolder");
  let btnAddTextFile = document.querySelector("#addTextFile");
  let divbreadcrumb = document.querySelector("#breadcrumb");
  let aRootPath = divbreadcrumb.querySelector("[purpose='path']");
  let divContainer = document.querySelector("#container");
  let templates = document.querySelector("#templates");
  let resources = [];
  let cfid = -1; // initially we are at root (which has an id of -1)
  let rid = 0;

  btnAddFolder.addEventListener("click", addFolder);

  btnAddTextFile.addEventListener("click", addTextFile);
  aRootPath.addEventListener("click", viewFolderFromPath);

  // validation - unique, non-blank
  function addFolder() {
    let rname = prompt("Enter folder's name");
    if (rname != null) {
      rname = rname.trim();
    }

    if (!rname) {
      // empty name validation
      alert("Empty name is not allowed.");
      return;
    }

    // uniqueness validation
    let alreadyExists = resources.some(
      (r) => r.rname == rname && r.pid == cfid
    );
    if (alreadyExists == true) {
      alert(rname + " is already in use. Try some other name");
      return;
    }

    let pid = cfid;
    rid++;
    addFolderHTML(rname, rid, pid);
    resources.push({
      rid: rid,
      rname: rname,
      rtype: "folder",
      pid: cfid,
    });
    saveToStorage();
  }

  function addTextFile() {
    let tfname = prompt("Enter text file's name");
    console.log(tfname);
  }

  function deleteFolder() {
   
      let spanDelete = this;
    let divFolder = spanDelete.parentNode;
      let divName = divFolder.querySelector("[purpose='name']");
      let fname = divName.innerHTML;
    
      

    
        divContainer.removeChild(divFolder);
        
        let idx = folders.findIndex(f => f.id == parseInt(divFolder.getAttribute("fid")));
        folders.splice(idx, 1);
      saveToStorage();
    // }
  }

  function deleteTextFile() {}

  // empty, old, unique
  function renameFolder() {
    let nrname = prompt("Enter folder's name");
    if (nrname != null) {
      nrname = nrname.trim();
    }

    if (!nrname) {
      // empty name validation
      alert("Empty name is not allowed.");
      return;
    }

    let spanRename = this;
    let divFolder = spanRename.parentNode;
    let divName = divFolder.querySelector("[purpose=name]");
    let orname = divName.innerHTML;
    let ridTBU = parseInt(divFolder.getAttribute("rid"));
    if (nrname == orname) {
      alert("Please enter a new name.");
      return;
    }

    let alreadyExists = resources.some(
      (r) => r.rname == nrname && r.pid == cfid
    );
    if (alreadyExists == true) {
      alert(nrname + " already exists.");
      return;
    }

    // change html
    divName.innerHTML = nrname;
    // change ram
    let resource = resources.find((r) => r.rid == ridTBU);
    resource.rname = nrname;
    // change storage
    saveToStorage();
  }

  function renameTextFile() {}

  function viewFolder() {
    let spanView = this;
    let divFolder = spanView.parentNode;
    let divName = divFolder.querySelector("[purpose='name']");

    let fname = divName.innerHTML;
    let fid = parseInt(divFolder.getAttribute("rid"));

    let aPathTemplate = templates.content.querySelector("a[purpose='path']");
    let aPath = document.importNode(aPathTemplate, true);

    aPath.innerHTML = fname;
    aPath.setAttribute("rid", fid);
    aPath.addEventListener("click", viewFolderFromPath);
    divbreadcrumb.appendChild(aPath);

    cfid = fid;
    divContainer.innerHTML = "";

    for (let i = 0; i < resources.length; i++) {
      if (resources[i].pid == cfid) {
        addFolderHTML(resources[i].rname, resources[i].rid, resources[i].pid);
      }
    }
  }

  function viewFolderFromPath() {
    let aPath = this;
    let fid = parseInt(aPath.getAttribute("rid"));

    while (aPath.nextSibling) {
      aPath.parentNode.removeChild(aPath.nextSibling);
    }

    cfid = fid;
    divContainer.innerHTML = "";

    for (let i = 0; i < resources.length; i++) {
      if (resources[i].pid == cfid) {
        addFolderHTML(resources[i].rname, resources[i].rid, resources[i].pid);
      }
    }
  }

  function viewTextFile() {}

  function addFolderHTML(rname, rid, pid) {
    let divFolderTemplate = templates.content.querySelector(".folder");
    let divFolder = document.importNode(divFolderTemplate, true); // makes a copy

    let spanRename = divFolder.querySelector("[action=rename]");
    let spanDelete = divFolder.querySelector("[action=delete]");
    let spanView = divFolder.querySelector("[action=view]");
    let divName = divFolder.querySelector("[purpose=name]");

    spanRename.addEventListener("click", renameFolder);
    spanDelete.addEventListener("click", deleteFolder);
    spanView.addEventListener("click", viewFolder);
    divName.innerHTML = rname;
    divFolder.setAttribute("rid", rid);
    divFolder.setAttribute("pid", pid);

    divContainer.appendChild(divFolder);
  }

  function saveToStorage() {
    let rjson = JSON.stringify(resources); // used to convert jso to a json string which can be saved
    localStorage.setItem("data", rjson);
  }

  function loadFromStorage() {
    let rjson = localStorage.getItem("data");
    if (!rjson) {
      return;
    }

    resources = JSON.parse(rjson);
    for (let i = 0; i < resources.length; i++) {
      if (resources[i].pid == cfid) {
        addFolderHTML(resources[i].rname, resources[i].rid, resources[i].pid);
      }

      if (resources[i].rid > rid) {
        rid = resources[i].rid;
      }
    }
  }

  loadFromStorage();
})();
// to prevent namespace pollution
