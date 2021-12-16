let products = [
  {
    name: "T-shirt",
    price: 25,
  },
  {
    name: "Headphones",
    price: 125,
  },
  
  {
    name: "Keyboard",
    price: 75,
  },
  {
    name: "Monitor",
    price: 200,
  },
];

let filteredProd = products
  .filter((v) => v.price >= 100)
  .map((v) => v.name.toUpperCase());
// console.log(filteredProd);




let prod = products.map((v) => { if (v.price >= 100) return v.name.toUpperCase(); else return v.name.toLowerCase(); } );
console.log(prod);


