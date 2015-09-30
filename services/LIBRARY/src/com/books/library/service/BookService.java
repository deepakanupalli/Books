/*Generated by WaveMaker Studio*/

package com.books.library.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.books.library.*;

/**
 * Service object for domain model class Book.
 * @see com.books.library.Book
 */

public interface BookService {
   /**
	 * Creates a new book.
	 * 
	 * @param created
	 *            The information of the created book.
	 * @return The created book.
	 */
	public Book create(Book created);

	/**
	 * Deletes a book.
	 * 
	 * @param bookId
	 *            The id of the deleted book.
	 * @return The deleted book.
	 * @throws EntityNotFoundException
	 *             if no book is found with the given id.
	 */
	public Book delete(Integer bookId) throws EntityNotFoundException;

	/**
	 * Finds all books.
	 * 
	 * @return A list of books.
	 */
	public Page<Book> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Book> findAll(Pageable pageable);
	
	/**
	 * Finds book by id.
	 * 
	 * @param id
	 *            The id of the wanted book.
	 * @return The found book. If no book is found, this method returns
	 *         null.
	 */
	public Book findById(Integer id) throws EntityNotFoundException;
	/**
	 * Updates the information of a book.
	 * 
	 * @param updated
	 *            The information of the updated book.
	 * @return The updated book.
	 * @throws EntityNotFoundException
	 *             if no book is found with given id.
	 */
	public Book update(Book updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the books in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the book.
	 */

	public long countAll();


    public Page<Book> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

