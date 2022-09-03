package com.Excel;

import java.io.ByteArrayInputStream;
import java.util.List;

public interface ExcelFileService {
	
	ByteArrayInputStream export(List<Contact> contacts);
	
}