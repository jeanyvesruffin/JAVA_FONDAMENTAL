package com.ruffin.interface_need;

import java.sql.ResultSet;
import java.util.Iterator;

public class DatabaseIterable implements Iterable<ClientEngagement> {

	private ResultSet resultSet;
	
	public DatabaseIterable(final ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	@Override
	public Iterator<ClientEngagement> iterator() {
		return new DataBaseIterator(resultSet);
	}

}
