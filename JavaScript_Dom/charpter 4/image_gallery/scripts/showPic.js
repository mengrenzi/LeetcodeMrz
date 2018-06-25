function showPic(whichPic) {
  var sourcePic = whichPic.getAttribute("href");
  var targetPic = document.getElementById("placeholder");
  targetPic.setAttribute("src", sourcePic);

  var sourceText = whichPic.getAttribute("name");
  var targetText = document.getElementById("description");
  targetText.firstChild.nodeValue = sourceText;

}