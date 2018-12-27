db.movies.find({$or: [{year:{$lt:2000}},{year:{$gt:2010}}]})



