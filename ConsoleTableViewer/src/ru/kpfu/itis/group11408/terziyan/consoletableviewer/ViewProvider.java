package ru.kpfu.itis.group11408.terziyan.consoletableviewer;

interface ViewProvider <T> {
    int getColumnCount();
    String getLabel(T obj, int n);
    String[] getHeader();
}
