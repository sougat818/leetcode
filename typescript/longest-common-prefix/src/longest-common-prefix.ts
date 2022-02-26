function longestCommonPrefix(strs: string[]): string {
  if (strs.length == 0) {
    return "";
  }
  if (strs.length == 1) {
    return strs[0];
  }
  const smallest = strs.reduce((a, b) => {
    if (a.length > b.length) {
      return a;
    }
    return b;
  });

  for (let i = 0; i < smallest.length; i++) {
    if (
      !strs.every((str) => {
        return str[i] == smallest[i];
      })
    ) {
      return smallest.substring(0, i);
    }
  }

  return smallest;
}

export default longestCommonPrefix;
