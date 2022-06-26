package ru.vsu.cs.sviridov_d_v.ProjectFiles;

public interface SimpleQueue<T> {
    void addElement(T element);
    int count();
    boolean isEmpty();
    T removeElement() throws Exception;
    T getElement() throws Exception;
}