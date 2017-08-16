import java.util.Scanner;

/**
 * 實作時間記錄：
 * 日期：<08/15>: <00:00>~<00:00>: <02:00>
 * 	   <08/16>: <00:00>~<00:00>: <02:15>
 * 程式目標：設計一個環狀資料結構，用來放整數
 * 功能描述
 * 一個可以放置n個整數的緩衝區
 * 資料依次放置
 * 空間不足時，從第一個整數開始往下覆蓋
 * 設計規格：
 * 建構：
 * 	傳入長度n，建構一長度為n的緩衝區
 * 寫入：
 * 	一個整數
 * 寫入：
 * 	一個整數陣列
 * 讀出：
 * 	目前在緩衝區的資料，請依資料順序排列
 * 設計想法：先建立建構式，寫一個write的方法可以寫入一個整數，寫一個writeArray的方法可以寫入一個整數陣列，
 * 寫一個readOut的方法可以讀出目前緩衝區的資料。
 * 
 * 虛擬碼：
 * 設定建構子依傳入的值決定陣列大小
 * 
 * 設定write的方法:
 * 如未超過緩衝區
 * 將輸入值加入buffer中
 * 超過緩衝區時
 * 將輸入的值加入buffer中
 * 當輸入值等於陣列最大值時重頭來過
 * 
 * 設定writeArray的方法:
 * 如未超過緩衝區
 * 將輸入值加入buffer中
 * 超過緩衝區時
 * 將輸入的值加入buffer中
 * 當輸入值等於陣列最大值時重頭來過
 */

public class DataStructure {
	private int[] buffer;
	private int length;
	private int firstLocation = 0;
	private int size = 0;

	// 設定建構子依傳入的值決定陣列大小
	public DataStructure(int length) {
		buffer = new int[length];
		this.length = length;
	}

	// 寫入一個整數
	public void write(int number) {
		// 未超過緩衝區
		if (size < length) {
			// 將輸入的值加入buffer中
			buffer[size] = number;
			size++;
			// 超過緩衝區
		} else {
			// 將輸入的值加入buffer中
			buffer[size] = number;
			size++;
			// 當輸入值等於陣列最大值時重頭來過
			if (size == buffer.length) {

				size = 0;
			}
		}
	}

	// 寫入一個整數陣列
	public void writeArray(int[] array) {
		for (int id1 = 0; id1 < array.length; id1++) {
			// 未超過緩衝區
			if (size < length) {
				// 將輸入的值加入buffer中
				buffer[size] = array[id1];
				size++;
				// 超過緩衝區
			} else {
				// 將輸入的值加入buffer中
				buffer[size] = array[id1];
				size++;
				// 當輸入值等於陣列大小時重頭來過
				while (size == buffer.length) {
					size = 0;
				}
			}
		}
	}

	public int[] readOut() {
		if (size <= 0) {
			return null;
		}
		int[] array = new int[size];
		for (int id1 = 0; id1 < size; id1++) {
			array[id1] = buffer[(firstLocation + id1) % length];
		}
		return array;
	}

}
