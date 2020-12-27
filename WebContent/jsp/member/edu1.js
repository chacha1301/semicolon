//edu1.js
// /GetEduListServ
// /eduDev.jsp

$.ajax({
	url:'../../GetEduListServ.do',/*전송페이지*/
	dataType: 'json',
	data: {'edusubject':edusubject},/*전송할 데이터*/
	success: function (result) {/*성공시 뿌려질 내용*/
		console.log(edusubject);
		for (obj of result)
			createRow(obj);
			console.log(obj);
	},
	error:function(){
		console.log('실패');
	}
});

function createRow(obj){

	let div9 = $('<div />').attr('class','row row-cols-1 row-cols-md-3 g-4');
	let div10 = $('<div />').attr('class','col');
	let div11 = $('<div />').attr('class','card h-100');
	let img1 = $('<img />').attr({
		'src':'../images/'+obj.eduImg,
		'class':'card-img-top'
		});
	let div12 = $('<div />').attr('class','card-body');
	let h5 = $('<h5 />').attr('class','card-title').html(obj.eduTitle);
	let p1 = $('<p />').attr('class','card-text').html('Edu 소개글');
	let div13 = $('<div />').attr('class','card-footer');
	let div14 = $('<div />').attr('class','buy_bt');
	let a1 = $('<a />').attr('href','#').html('Buy Now');
	let eduprice = new Intl.NumberFormat('ko-KR', {
		style: 'currency',
		currency: 'KRW'
	}).format(obj.eduprice);
	let p2 = $('<p />').attr('class','price_text').html(eduprice);
	let span = $('<span/>').attr({'style':'color: #262626;','html':'$ 30'});
	let a2_1 = $('<a />').attr({'class':'carousel-control-prev','href':'#main_slider','role':'button','data-slide':'prev'});
	let i1_1 = $('<i />').attr('class','fa fa-angle-left');
	let a2_2 = $('<a />').attr({'class':'carousel-control-next','href':'#main_slider','role':'button','data-slide':'next'});
	let i1_2 = $('<i />').attr('class','fa-angle-right');
	
	
	p2.attr(span);
	div14.append(a1,p2);
	div13.append(div14);
	div12.append(h5,p1);
	div11.append(img1,div12,div13,div14);
	div10.append(div11);
	div9.append(div10);
	$('#data').append(div9);




}