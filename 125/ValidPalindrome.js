/**
 * @param {string} s
 * @return {boolean}
 */

var isPalindrome = function (s) {
  s = s.replace(/[\W]/g, '');
  s = s.toLowerCase();
  var _s = s.split('').reverse().join('');
  return s === _s;
};

console.log(isPalindrome("Race ecaR"))