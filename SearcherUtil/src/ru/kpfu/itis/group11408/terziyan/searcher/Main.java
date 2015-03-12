package ru.kpfu.itis.group11408.terziyan.searcher;

public class Main {

	public static void main(String[] args) {
		Searcher searcher = new Searcher();
		ConsoleRead cr = new ConsoleRead(args);
		if (cr.recursion) {
			if (cr.folder) {
				try {
					System.out.println(searcher.getAll(cr.startAt, cr.mask)
							.toString());
				} catch (Exception e) {
					System.out.println(e);
				}
			} else {
				try {
					System.out.println(searcher.getFiles(cr.startAt, cr.mask)
							.toString());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} else if (cr.isdepth) {
			if (cr.folder) {
				try {
					System.out.println(searcher.getAll(cr.startAt, cr.mask,
							cr.depth).toString());
				} catch (Exception e) {
					System.out.println(e);
				}
			} else {
				try {
					System.out.println(searcher.getFiles(cr.startAt, cr.mask,
							cr.depth).toString());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
