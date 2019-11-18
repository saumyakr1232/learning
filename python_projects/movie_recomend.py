import imdb
hr=imdb.IMDb()
movie_name=input("Enter the movie name")
movies=hr.search_movie(str(movie_name))
index=movies[0].getID()
movie=hr.get_movie(index)
title=movie["tittle"]
year=movie["year"]
cast=movie['cast']
