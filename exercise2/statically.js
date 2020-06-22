class Statically {
  constructor(_glue, jello) {
    this._glue = _glue;
    this.jello = jello;
  }

  getGlue = function () {
    return "epoxy";
  };

  getJello = function () {
    return "jello";
  };
  moveAndShake() {
    console.log("Never stagnate in life.  Be agile, change, and improve...");
  }

  static stubborn(moveAndShake) {
    console.log("Please don't make me change... I just don't like it...");
  }

  static explain(stubborn) {
    console.log("epoxy");
    console.log(
      "Static keyword in Java is used to show you don't need to create an instance of the class. Static in javascript means the function is a utility type function that should not be instantiated but rather used as a template or just called to perform a function."
    );
  }
}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

stats.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log("This is stats.getGlue: " + stats.getGlue);
console.log("This is stats.jello " + stats.getJello);