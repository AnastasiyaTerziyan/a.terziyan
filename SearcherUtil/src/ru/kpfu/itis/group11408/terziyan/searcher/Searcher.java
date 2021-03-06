package ru.kpfu.itis.group11408.terziyan.searcher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Searcher {
	private long filesNumber = 0;
	private long directoriesNumber = 0;
	private long totalNumber = 0;

	private final int FILES = 0;
	private final int DIRECTORIES = 1;
	private final int ALL = 2;

	public Searcher() {
	}

	public List getAll(String startPath, String mask) throws Exception {
		return find(startPath, mask, ALL);
	}

	public List getFiles(String startPath, String mask) throws Exception {
		return find(startPath, mask, FILES);
	}

	public List getAll(String startPath, String mask, int depth)
			throws Exception {
		return find(startPath, mask, ALL, depth);
	}

	public List getFiles(String startPath, String mask, int depth)
			throws Exception {
		return find(startPath, mask, FILES, depth);
	}

	private List find(String startPath, String mask, int objectType)
			throws Exception {
		if (startPath == null || mask == null) {
			throw new Exception("Error: parameters don't match");
		}
		File topDirectory = new File(startPath);
		if (!topDirectory.exists()) {
			throw new Exception("Error: this path doesn't exist");
		}
		ArrayList res = new ArrayList(100);
		search(topDirectory, res, objectType, mask);
		return res;
	}

	private void search(File topDirectory, List res, int objectType, String mask) {
		File[] list = topDirectory.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				if (objectType != FILES && list[i].toString().contains(mask)) {
					res.add(list[i]);
				}
				search(list[i], res, objectType, mask);
			} else {
				if (objectType != DIRECTORIES
						&& list[i].toString().contains(mask)) {
					res.add(list[i]);
				}
			}
		}
	}

	private List find(String startPath, String mask, int objectType, int depth)
			throws Exception {
		if (startPath == null || mask == null) {
			throw new Exception("Error: parameters don't match");
		}
		File topDirectory = new File(startPath);
		if (!topDirectory.exists()) {
			throw new Exception("Error: this path doesn't exist");
		}
		ArrayList res = new ArrayList(100);
		search(topDirectory, res, objectType, mask, depth);

		return res;
	}

	private void search(File topDirectory, List res, int objectType,
			String mask, int depth) {
		File[] list = topDirectory.listFiles();
		while (depth != 0) {
			for (int i = 0; i < list.length; i++) {
				if (list[i].isDirectory()) {
					if (objectType != FILES
							&& list[i].toString().contains(mask)) {
						res.add(list[i]);
					}
					search(list[i], res, objectType, mask);
				} else {
					if (objectType != DIRECTORIES
							&& list[i].toString().contains(mask)) {
						res.add(list[i]);
					}
				}
			}
			depth--;
		}
	}
}
