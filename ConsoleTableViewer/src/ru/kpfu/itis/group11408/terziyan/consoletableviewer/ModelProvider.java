package ru.kpfu.itis.group11408.terziyan.consoletableviewer;

import java.util.Comparator;

interface ModelProvider <T> {
	Comparator<T> getComparator();
    T[] getElements(int n);
}