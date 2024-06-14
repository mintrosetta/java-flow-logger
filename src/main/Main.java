package main;


public class Main {
	public static void main(String[] args) {
		System.out.println("FlowLogger !");

		LoggerData log1 = new LoggerData();
		log1.setKey("ไม่เป็น operation");

		LoggerData log2 = new LoggerData();
		log2.setKey("เคสยกเลิก");
		log2.append("PRBStatus", "c");
		log2.append("PLCStatus", "a");

		FlowLogger logs = new FlowLoggerImpl();
		logs.append(log1);
		logs.append(log2);

		System.out.println(logs.toString());
	}
}
