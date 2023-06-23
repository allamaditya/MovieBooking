package com.moviebookingapp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class MovieTest {

	
    @Test
    void testGetLoginId() throws Exception {
        Movie movie=Mockito.mock(Movie.class);
        when(movie.getMovieId()).thenReturn(1);
        assertEquals(movie.getMovieId(), 1);
    }
    @Test
    void testGetMovieName() throws Exception {
        Movie movie=Mockito.mock(Movie.class);
        when(movie.getMovieName()).thenReturn("Cars");
        assertEquals(movie.getMovieName(), "Cars");
    }
    @Test
    void testGetTotalTickets() throws Exception {
        Movie movie=Mockito.mock(Movie.class);
        when(movie.getTotalTickets()).thenReturn(100);
        assertEquals(movie.getTotalTickets(), 100);
    }
    @Test
    void testGetTheaterName() throws Exception {
        Movie movie=Mockito.mock(Movie.class);
        when(movie.getTheaterName()).thenReturn("INOX");
        assertEquals(movie.getTheaterName(), "INOX");
    }

    @SuppressWarnings("deprecation")
	@Test
    void testGetReleaseDate() throws Exception {
        Movie movie=Mockito.mock(Movie.class);
        when(movie.getReleaseDate()).thenReturn(new Date(2021,06,12));
        assertEquals(movie.getReleaseDate(), new Date(2021,06,12));
    }

//    @Test
//    void testSetLoginId() throws Exception {
//        Movie movie=Mockito.mock(Movie.class);
//        when(movie.setMovieId(1)).thenReturn(1);
//        assertEquals(movie.setMovieId(1), 1);
//    }
//    @Test
//    void testSetMovieName() throws Exception {
//        Movie movie=Mockito.mock(Movie.class);
//        when(movie.setMovieName("Krish")).thenReturn("Krish");
//        assertEquals(movie.setMovieName("Krish"), "Krish");
//    }
//    @Test
//    void testSetTotalTickets() throws Exception {
//        Movie movie=Mockito.mock(Movie.class);
//        when(movie.setTotalTickets(100)).thenReturn(100);
//        assertEquals(movie.setTotalTickets(100), 100);
//    }
//    @Test
//    void testSetTheaterName() throws Exception {
//        Movie movie=Mockito.mock(Movie.class);
//        when(movie.setTheaterName("INOX")).thenReturn("INOX");
//        assertEquals(movie.setTheaterName("INOX"), "INOX");
//    }
    @SuppressWarnings("deprecation")
	@Test
    void testSetReleaseDate() throws Exception {
        Movie movie=Mockito.mock(Movie.class);
        when(movie.setReleaseDate(new Date(2021,06,12))).thenReturn(new Date(2021,06,12));
        assertEquals(movie.setReleaseDate(new Date(2021,06,12)), new Date(2021,06,12));
    }



}
