var longestCommonPrefix = function (strs) {
  if (strs.length == 0) {
    return "";
  }
  if (strs.length == 1) {
    return strs[0];
  }

  const minimum = strs.reduce(function (a, b) {
    if (a.length < b.length) {
      return a;
    }
    return b;
  }, 0);

  for (let i = 0; i < minimum.length; i++) {
    if (
      !strs.every((str) => {
        return str[i] == minimum[i];
      })
    ) {
      return minimum.substring(0, i);
    }
  }
  return minimum;
};

export default longestCommonPrefix;
