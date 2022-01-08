(function () {
    let btnAddFolder = document.querySelector("#addFolder");
    let btnAddTextFile = document.querySelector("#addTextFile");
    let divbreadcrumb = document.querySelector("#breadcrumb");
    let divContainer = document.querySelector("#container");
    let templates = document.querySelector("#templates");


    btnAddFolder.addEventListener("click",addFolder);
    btnAddTextFile.addEventListener("click", addTextFile);
    function addFolder() {
        let fname = prompt("add Folder's Name ?");
        let divFolderTemplate = templates.content.querySelector(".folder");
        let divFolder = document.importNode(divFolderTemplate, true);
        let divName = divFolder.querySelector("[purpose=name]");
        divName.innerHTML = fname;
        divContainer.appendChild(divFolder);
    }
    function addTextFile() {
        let tfname = prompt("add TextFile's Name ?");
        console.log(tfname);
    }

     function deleteFolder() {
         
     }
    function deleteTextFile() {
    }
    function renameFolder() {
    }
    function renameTextFile() {
    }
    function viewFolder() {
    }
    function viewFolder() {
    }
    function savetoStorage() {
        
    }
    function loadFromStorage() {
        
    }
             
    loadFromStorage();
    }
)();