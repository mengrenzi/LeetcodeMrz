// vowels: a e i o u
/**
 * @param {string} s
 * @return {string}
 */

var reverseVowels = function (s) {
  var len = s.length,
    vowels = "aeiouAEIOU",
    arr = s.split("")

  for (var left = 0, right = len - 1; left <= right;) {
    for (; left <= right; left++) {
      if (vowels.indexOf(arr[left]) !== -1) {
        break;
      }
    }
    for (; left <= right; right--) {
      if (vowels.indexOf(arr[right]) !== -1) {
        break;
      }
    }
    //console.log(right + " " + left)
    var temp = arr[left]
    arr[left] = arr[right]
    arr[right] = temp
  }
  //  console.log(arr.join(""))
  return arr.join("");
};

console.log(reverseVowels("leetcode"))