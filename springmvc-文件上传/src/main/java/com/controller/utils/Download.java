package com.controller.utils;

import com.controller.pojo.DownloadRecord;
import com.sun.jmx.snmp.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Download {
    public static void download(String fileName, String filePath,
                                HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //������������״̬�ļ�¼����
        DownloadRecord downloadRecord = new DownloadRecord(fileName, filePath, request);
        //������Ӧͷ�Ϳͻ��˱����ļ���
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
        //���ڼ�¼����ɵ����ص�����������λ��byte
        long downloadedLength = 0l;
        try {
            //�򿪱����ļ���
            InputStream inputStream = new FileInputStream(filePath);
            //�������ز���
            OutputStream os = response.getOutputStream();

            //ѭ��д�������
            byte[] b = new byte[2048];
            int length;
            while ((length = inputStream.read(b)) > 0) {
                os.write(b, 0, length);
                downloadedLength += b.length;
            }

            // ������Ҫ�رա�
            os.close();
            inputStream.close();
        } catch (Exception e){
            downloadRecord.setStatus(DownloadRecord.STATUS_ERROR);
            throw e;
        }
        downloadRecord.setStatus(DownloadRecord.STATUS_SUCCESS);
        downloadRecord.setEndTime(new Timestamp(System.currentTimeMillis()));
        downloadRecord.setLength(downloadedLength);
        //�洢��¼
    }
}
