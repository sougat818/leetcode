import lcm from "./longest-common-prefix";

test("Simple test", () => {
  expect(lcm(["flower", "flow", "flight"])).toBe("fl");
  expect(lcm(["dog", "racecar", "car"])).toBe("");
});
