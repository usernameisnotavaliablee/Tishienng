package com.bykv.vk.component.ttvideo.mediakit.downloader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLResponse {
    private static final java.lang.String TAG = "AVMDLResponse";
    public com.bytedance.sdk.component.xt.j.xt call;
    public long contentlength;
    public boolean isReadErr;
    public long readOff;
    public com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest request;
    public com.bytedance.sdk.component.xt.j.av response;
    public int statusCode;

    public AVMDLResponse(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r1, com.bytedance.sdk.component.xt.j.av r2, com.bytedance.sdk.component.xt.j.xt r3) {
            r0 = this;
            r0.<init>()
            r0.request = r1
            r0.response = r2
            r0.call = r3
            r2 = -1
            r0.contentlength = r2
            r2 = -1
            r0.statusCode = r2
            long r1 = r1.reqOff
            r0.readOff = r1
            r1 = 0
            r0.isReadErr = r1
            r0.parseResponse()
            return
    }

    private void parseResponse() {
            r3 = this;
            com.bytedance.sdk.component.xt.j.av r0 = r3.response
            if (r0 != 0) goto L5
            goto L4f
        L5:
            int r0 = r0.cw()
            r3.statusCode = r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L1f
            com.bytedance.sdk.component.xt.j.av r0 = r3.response
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = r0.j(r1)
            int r0 = toInt(r0)
            long r0 = (long) r0
            r3.contentlength = r0
            return
        L1f:
            r1 = 206(0xce, float:2.89E-43)
            if (r0 != r1) goto L4f
            com.bytedance.sdk.component.xt.j.av r0 = r3.response
            java.lang.String r1 = "Content-Range"
            java.lang.String r0 = r0.j(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4f
            java.lang.String r1 = "/"
            int r1 = r0.lastIndexOf(r1)
            if (r1 < 0) goto L4f
            int r2 = r0.length()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L4f
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            r1 = -1
            int r0 = toInt(r0, r1)
            long r0 = (long) r0
            r3.contentlength = r0
        L4f:
            return
    }

    public static int toInt(java.lang.String r1) {
            r0 = 0
            int r1 = toInt(r1, r0)
            return r1
    }

    public static int toInt(java.lang.String r1, int r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lc
            return r1
        Lc:
            return r2
    }

    public void cancel() {
            r1 = this;
            com.bytedance.sdk.component.xt.j.xt r0 = r1.call
            if (r0 == 0) goto L7
            r0.xt()
        L7:
            return
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    public boolean isFinish() {
            r9 = this;
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r0 = r9.request
            long r1 = r0.size
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto Le
            long r3 = r0.reqOff
            long r3 = r3 + r1
            goto L10
        Le:
            long r3 = r9.contentlength
        L10:
            long r0 = r9.contentlength
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            r3 = r0
        L17:
            long r0 = r9.readOff
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r1 = r9.request
            long r1 = r1.reqOff
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r2 = r9.request
            long r5 = r2.size
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r5 = r9.contentlength
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r0
            r0 = 1
            r7[r0] = r1
            r1 = 2
            r7[r1] = r2
            r1 = 3
            r7[r1] = r5
            r1 = 4
            r7[r1] = r6
            java.lang.String r1 = "check readoff:%d reqoff:%d reqsize:%d contentlen:%d endoff:%d"
            java.lang.String.format(r1, r7)
            long r1 = r9.readOff
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L55
            return r0
        L55:
            return r8
    }

    public boolean isOpenSuccessful() {
            r2 = this;
            int r0 = r2.statusCode
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto Lc
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isReadSuccessful() {
            r1 = this;
            boolean r0 = r1.isReadErr
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    public int readData(byte[] r13) {
            r12 = this;
            com.bytedance.sdk.component.xt.j.av r0 = r12.response
            com.bytedance.sdk.component.xt.j.i r0 = r0.m()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r0 = 1
            com.bytedance.sdk.component.xt.j.av r2 = r12.response     // Catch: java.io.IOException -> L59
            com.bytedance.sdk.component.xt.j.i r2 = r2.m()     // Catch: java.io.IOException -> L59
            java.io.InputStream r2 = r2.cw()     // Catch: java.io.IOException -> L59
            int r13 = r2.read(r13)     // Catch: java.io.IOException -> L59
            if (r13 <= 0) goto L9f
            java.lang.String r2 = "before read off:%d reqoff:%d req size:%d"
            long r3 = r12.readOff     // Catch: java.io.IOException -> L59
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.io.IOException -> L59
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r4 = r12.request     // Catch: java.io.IOException -> L59
            long r4 = r4.reqOff     // Catch: java.io.IOException -> L59
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.io.IOException -> L59
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r5 = r12.request     // Catch: java.io.IOException -> L59
            long r5 = r5.size     // Catch: java.io.IOException -> L59
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.io.IOException -> L59
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.io.IOException -> L59
            r7[r1] = r3     // Catch: java.io.IOException -> L59
            r7[r0] = r4     // Catch: java.io.IOException -> L59
            r3 = 2
            r7[r3] = r5     // Catch: java.io.IOException -> L59
            java.lang.String.format(r2, r7)     // Catch: java.io.IOException -> L59
            long r4 = r12.readOff     // Catch: java.io.IOException -> L59
            long r7 = (long) r13     // Catch: java.io.IOException -> L59
            long r4 = r4 + r7
            r12.readOff = r4     // Catch: java.io.IOException -> L59
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r2 = r12.request     // Catch: java.io.IOException -> L59
            long r4 = r2.reqOff     // Catch: java.io.IOException -> L59
            long r4 = r4 + r7
            r2.reqOff = r4     // Catch: java.io.IOException -> L59
            long r4 = r2.size     // Catch: java.io.IOException -> L59
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L5b
            long r4 = r4 - r7
            r2.size = r4     // Catch: java.io.IOException -> L59
            goto L5b
        L59:
            r13 = move-exception
            goto L86
        L5b:
            java.lang.String r2 = "after read,ret:%d off:%d reqoff:%d req size:%d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)     // Catch: java.io.IOException -> L59
            long r7 = r12.readOff     // Catch: java.io.IOException -> L59
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch: java.io.IOException -> L59
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r7 = r12.request     // Catch: java.io.IOException -> L59
            long r7 = r7.reqOff     // Catch: java.io.IOException -> L59
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.io.IOException -> L59
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r8 = r12.request     // Catch: java.io.IOException -> L59
            long r8 = r8.size     // Catch: java.io.IOException -> L59
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.io.IOException -> L59
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.io.IOException -> L59
            r9[r1] = r4     // Catch: java.io.IOException -> L59
            r9[r0] = r5     // Catch: java.io.IOException -> L59
            r9[r3] = r7     // Catch: java.io.IOException -> L59
            r9[r6] = r8     // Catch: java.io.IOException -> L59
            java.lang.String.format(r2, r9)     // Catch: java.io.IOException -> L59
            return r13
        L86:
            r12.isReadErr = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "read data exception:"
            r0.<init>(r1)
            java.lang.String r13 = r13.getLocalizedMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "AVMDLResponse"
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r0, r13)
        L9f:
            r13 = -1
            return r13
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.response = r0
            r2.call = r0
            r0 = -1
            r2.contentlength = r0
            r0 = -1
            r2.statusCode = r0
            r0 = 0
            r2.isReadErr = r0
            return
    }
}
