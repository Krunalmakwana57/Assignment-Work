package assignment;

import java.util.List;

public interface ReaderDao {
    void addReader(Reader reader);
    void updateReader(Reader reader);
    void deleteReader(int readerId);
    Reader getReader(int readerId);
    List<Reader> getAllReaders();
}

