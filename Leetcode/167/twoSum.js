var twoSum = function (numbers, target) {
  var hash = {};
  for (var i = 0, len = numbers.length; i < len; i++) {
    var item = target - numbers[i];
    if (hash[item] === undefined) {
      hash[numbers[i]] = i;
      continue;
    }
    return [hash[item] + 1, i + 1];
  }
};

var number = new Array(7, 3, 6, 15)
console.log(twoSum(number, 9))