package ru.kpfu.itis.group11408.terziyan.queue;

public class Physical {
	Queue<String> queue = new ArrayQueue<String>();
	Deanery dr = new Deanery();

	public void toQueue() {

		for (int i = 0; i < dr.getSize(); i++) {
			try {
				queue.offer(dr.getStudent());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				if (queue.size() == queue.maxSize() - 1) {
					while (!queue.isEmpty()) {
						System.out.print(queue.poll() + " ");
					}
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			while (!queue.isEmpty()) {
				System.out.print(queue.poll() + " ");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
