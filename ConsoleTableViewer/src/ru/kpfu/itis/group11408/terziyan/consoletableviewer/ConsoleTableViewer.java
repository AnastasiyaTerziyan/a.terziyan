package ru.kpfu.itis.group11408.terziyan.consoletableviewer;
import java.util.Arrays;

public class ConsoleTableViewer  {
    public ModelProvider<Student> model;
    public ViewProvider<Student> view;
    int height;
    Student[] students;

    public ConsoleTableViewer(ModelProvider<Student> model, ViewProvider<Student> view, int height) {
        this.model = model;
        this.view = view;
        this.height = height;
        students = new Student[model.getElements(this.height).length];
        students = model.getElements(this.height);
        Arrays.sort(students, model.getComparator());
    }

    public void show(){
        for (int i = 0; i < view.getColumnCount(); i++) {
            System.out.printf("%10s", view.getHeader()[i]);
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%10s", "Student" + " " + i);
            System.out.printf("%10s", view.getLabel(students[i], 1));
            System.out.printf("%10s", view.getLabel(students[i], 3));
            System.out.printf("%10s", view.getLabel(students[i], 2));
            System.out.println();
        }
    }
}

//import java.util.Comparator;
//
//public class ConsoleTableViewer<T> implements ModelProvider<T>,ViewProvider<T>{
//	
//	public void setModelProvider(){
//		
//	}
//	
//	public void setViewProvider(){
//		
//	}
//
//	@Override
//	public int getColuwinCount() {
//		// TODO Auto-generated method stub
//		return number;
//	}
//
//	@Override
//	public String getLabel(T t, int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getHeader(int header) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <T> Comparator<T> getComparator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public T[] getElements() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//}
