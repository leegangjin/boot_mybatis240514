console.log("board Detail js in");
document.getElementById('listBtn').addEventListener('click',()=>{
    location.href="/board/list";
})


document.getElementById('delBtn').addEventListener('click',()=>{
    document.getElementById('delForm').submit();
});

document.getElementById('modBtn').addEventListener('click',()=>{
    document.getElementById('title').readOnly=false;
    document.getElementById('content').readOnly=false;

    let modBtn = document.createElement('button');
    // <button></button>
    modBtn.setAttribute('type','submit');
    modBtn.classList.add('btn','btn-outline-warning');
    modBtn.innerText="Submit";
    //생성한 버튼 modForm에 추가
    document.getElementById('modForm').appendChild(modBtn);

    //modBtn , delBtn 임시삭제
    document.getElementById('modBtn').remove();
    document.getElementById('delBtn').remove();
    
})
