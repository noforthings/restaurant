const showPreview=(fn)=>{
	if(event.target.files.length > 0){
		var src = URL.createObjectURL(event.target.files[0]);
		var preview = document.getElementById('preview');
		preview.src = src;
		preview.style.display='block';
	}
}