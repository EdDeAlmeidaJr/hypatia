db.books.createIndex({ title: "text", author: "text", content: "text" })
db.books.createIndex({ language: 1 })
db.books.createIndex({ type: 1 })
db.books.createIndex({ genre: 1 })
