package xyz.adscope.common.network.download;

import xyz.adscope.common.network.download.Download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class BasicWorker<T extends xyz.adscope.common.network.download.Download> implements java.util.concurrent.Callable<java.lang.String> {
    private final T a;
    private java.lang.String b;
    private java.lang.String c;
    private xyz.adscope.common.network.download.Download.ProgressBar d;
    private xyz.adscope.common.network.download.Download.Policy e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AsyncProgressBar implements xyz.adscope.common.network.download.Download.ProgressBar {
        private final xyz.adscope.common.network.download.Download.ProgressBar a;
        private final java.util.concurrent.Executor b;


        AsyncProgressBar(xyz.adscope.common.network.download.Download.ProgressBar r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
                java.util.concurrent.Executor r1 = r1.getMainExecutor()
                r0.b = r1
                return
        }

        static /* synthetic */ xyz.adscope.common.network.download.Download.ProgressBar a(xyz.adscope.common.network.download.BasicWorker.AsyncProgressBar r0) {
                xyz.adscope.common.network.download.Download$ProgressBar r0 = r0.a
                return r0
        }

        @Override // xyz.adscope.common.network.download.Download.ProgressBar
        public void onProgress(int r9, long r10, long r12) {
                r8 = this;
                java.util.concurrent.Executor r0 = r8.b
                xyz.adscope.common.network.download.BasicWorker$AsyncProgressBar$1 r1 = new xyz.adscope.common.network.download.BasicWorker$AsyncProgressBar$1
                r2 = r8
                r3 = r9
                r4 = r10
                r6 = r12
                r1.<init>(r2, r3, r4, r6)
                r0.execute(r1)
                return
        }
    }

    BasicWorker(T r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.lang.String r0 = r3.directory()
            r2.b = r0
            java.lang.String r0 = r3.fileName()
            r2.c = r0
            xyz.adscope.common.network.download.BasicWorker$AsyncProgressBar r0 = new xyz.adscope.common.network.download.BasicWorker$AsyncProgressBar
            xyz.adscope.common.network.download.Download$ProgressBar r1 = r3.progressBar()
            r0.<init>(r1)
            r2.d = r0
            xyz.adscope.common.network.download.Download$Policy r3 = r3.policy()
            r2.e = r3
            return
    }

    private java.lang.String a(xyz.adscope.common.network.Headers r4) {
            r3 = this;
            java.lang.String r4 = r4.getContentDisposition()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L35
            java.lang.String r0 = "filename"
            java.lang.String r2 = xyz.adscope.common.network.Headers.parseSubValue(r4, r0, r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L35
            java.lang.String r4 = "utf-8"
            java.lang.String r2 = xyz.adscope.common.network.util.UrlUtils.urlDecode(r2, r4)
            java.lang.String r4 = "\""
            boolean r0 = r2.startsWith(r4)
            if (r0 == 0) goto L35
            boolean r4 = r2.endsWith(r4)
            if (r4 == 0) goto L35
            int r4 = r2.length()
            int r4 = r4 - r1
            java.lang.String r2 = r2.substring(r1, r4)
        L35:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L63
            T extends xyz.adscope.common.network.download.Download r4 = r3.a
            xyz.adscope.common.network.Url r4 = r4.url()
            java.lang.String r0 = r4.getPath()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L58
            java.lang.String r4 = r4.toString()
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toString(r4)
            return r4
        L58:
            java.lang.String r4 = "/"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            int r0 = r0 - r1
            r4 = r4[r0]
            return r4
        L63:
            return r2
    }

    protected abstract xyz.adscope.common.network.Response a(T r1);

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.String call() {
            r1 = this;
            java.lang.String r0 = r1.call2()
            return r0
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: call, reason: avoid collision after fix types in other method */
    public java.lang.String call2() {
            r34 = this;
            r1 = r34
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1e9
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r1.b
            r0.<init>(r2)
            xyz.adscope.common.network.util.IOUtils.createFolder(r0)
            r2 = 0
            java.lang.String r0 = r1.c     // Catch: java.lang.Throwable -> L4c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = ".kalle"
            if (r0 == 0) goto L4f
            T extends xyz.adscope.common.network.download.Download r0 = r1.a     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.Response r2 = r1.a(r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = r2.code()     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.Headers r4 = r2.headers()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L4c
            r1.c = r5     // Catch: java.lang.Throwable -> L4c
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = r1.b     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r7.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = r1.c     // Catch: java.lang.Throwable -> L4c
            r7.append(r8)     // Catch: java.lang.Throwable -> L4c
            r7.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L4c
            goto Lba
        L4c:
            r0 = move-exception
            goto L1e5
        L4f:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r1.b     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r4.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = r1.c     // Catch: java.lang.Throwable -> L4c
            r4.append(r6)     // Catch: java.lang.Throwable -> L4c
            r4.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r0, r3)     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.download.Download$Policy r0 = r1.e     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.isRange()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto La9
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto La9
            T extends xyz.adscope.common.network.download.Download r0 = r1.a     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.Headers r0 = r0.headers()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "Range"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r4.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "bytes="
            r4.append(r6)     // Catch: java.lang.Throwable -> L4c
            long r6 = r5.length()     // Catch: java.lang.Throwable -> L4c
            r4.append(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "-"
            r4.append(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4c
            r0.set2(r3, r4)     // Catch: java.lang.Throwable -> L4c
            T extends xyz.adscope.common.network.download.Download r0 = r1.a     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.Response r2 = r1.a(r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = r2.code()     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.Headers r4 = r2.headers()     // Catch: java.lang.Throwable -> L4c
            goto Lba
        La9:
            T extends xyz.adscope.common.network.download.Download r0 = r1.a     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.Response r2 = r1.a(r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = r2.code()     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.Headers r4 = r2.headers()     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.util.IOUtils.delFileOrFolder(r5)     // Catch: java.lang.Throwable -> L4c
        Lba:
            xyz.adscope.common.network.download.Download$Policy r3 = r1.e     // Catch: java.lang.Throwable -> L1d7
            boolean r3 = r3.allowDownload(r0, r4)     // Catch: java.lang.Throwable -> L1d7
            if (r3 == 0) goto L1db
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r6 = r1.b     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r7 = r1.c     // Catch: java.lang.Throwable -> L1d7
            r3.<init>(r6, r7)     // Catch: java.lang.Throwable -> L1d7
            boolean r6 = r3.exists()     // Catch: java.lang.Throwable -> L1d7
            if (r6 == 0) goto Lf1
            java.lang.String r6 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.download.Download$Policy r7 = r1.e     // Catch: java.lang.Throwable -> L4c
            boolean r7 = r7.oldAvailable(r6, r0, r4)     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto Lee
            xyz.adscope.common.network.download.Download$ProgressBar r8 = r1.d     // Catch: java.lang.Throwable -> L4c
            long r10 = r3.length()     // Catch: java.lang.Throwable -> L4c
            r12 = 0
            r9 = 100
            r8.onProgress(r9, r10, r12)     // Catch: java.lang.Throwable -> L4c
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r2)
            return r6
        Lee:
            xyz.adscope.common.network.util.IOUtils.delFileOrFolder(r3)     // Catch: java.lang.Throwable -> L4c
        Lf1:
            r6 = 206(0xce, float:2.89E-43)
            if (r0 != r6) goto L10a
            java.lang.String r0 = r4.getContentRange()     // Catch: java.lang.Throwable -> L4c
            r4 = 47
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L4c
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)     // Catch: java.lang.Throwable -> L4c
            long r6 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L4c
            goto L111
        L10a:
            xyz.adscope.common.network.util.IOUtils.createNewFile(r5)     // Catch: java.lang.Throwable -> L1d7
            long r6 = r4.getContentLength()     // Catch: java.lang.Throwable -> L1d7
        L111:
            long r8 = r5.length()     // Catch: java.lang.Throwable -> L1d7
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r4 = "rws"
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L1d7
            r0.seek(r8)     // Catch: java.lang.Throwable -> L1d7
            r4 = 8096(0x1fa0, float:1.1345E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1d7
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d7
            xyz.adscope.common.network.ResponseBody r12 = r2.body()     // Catch: java.lang.Throwable -> L1d7
            java.io.InputStream r12 = r12.stream()     // Catch: java.lang.Throwable -> L1d7
            r13 = 0
            r18 = r8
            r8 = 0
            r14 = 0
            r16 = 0
            r20 = 0
        L139:
            int r15 = r12.read(r4)     // Catch: java.lang.Throwable -> L1d7
            r26 = r2
            r2 = -1
            if (r15 == r2) goto L1bf
            r0.write(r4, r13, r15)     // Catch: java.lang.Throwable -> L18c
            r27 = r14
            long r13 = (long) r15     // Catch: java.lang.Throwable -> L18c
            long r30 = r18 + r13
            long r8 = r8 + r13
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18c
            long r13 = r13 - r10
            r18 = 400(0x190, double:1.976E-321)
            int r15 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r15 >= 0) goto L15b
            r24 = r20
            r13 = r27
            goto L1b5
        L15b:
            r18 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 * r8
            long r32 = r18 / r13
            int r13 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r13 == 0) goto L190
            r13 = 100
            long r13 = r13 * r30
            long r13 = r13 / r6
            int r14 = (int) r13     // Catch: java.lang.Throwable -> L18c
            r13 = r27
            if (r14 != r13) goto L177
            int r15 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r15 == 0) goto L174
            goto L177
        L174:
            r24 = r20
            goto L1b5
        L177:
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18c
            xyz.adscope.common.network.download.Download$ProgressBar r10 = r1.d     // Catch: java.lang.Throwable -> L18c
            r28 = r10
            r29 = r14
            r28.onProgress(r29, r30, r32)     // Catch: java.lang.Throwable -> L18c
            r10 = r8
            r8 = r16
            r14 = r29
        L189:
            r20 = r32
            goto L1b8
        L18c:
            r0 = move-exception
            r2 = r26
            goto L1e5
        L190:
            r13 = r27
            int r14 = (r20 > r32 ? 1 : (r20 == r32 ? 0 : -1))
            if (r14 == 0) goto L1a8
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18c
            xyz.adscope.common.network.download.Download$ProgressBar r10 = r1.d     // Catch: java.lang.Throwable -> L18c
            r29 = 0
            r28 = r10
            r28.onProgress(r29, r30, r32)     // Catch: java.lang.Throwable -> L18c
            r10 = r8
            r14 = r13
            r8 = r16
            goto L189
        L1a8:
            xyz.adscope.common.network.download.Download$ProgressBar r14 = r1.d     // Catch: java.lang.Throwable -> L18c
            r24 = r20
            r21 = 0
            r20 = r14
            r22 = r30
            r20.onProgress(r21, r22, r24)     // Catch: java.lang.Throwable -> L18c
        L1b5:
            r14 = r13
            r20 = r24
        L1b8:
            r2 = r26
            r18 = r30
            r13 = 0
            goto L139
        L1bf:
            r24 = r20
            xyz.adscope.common.network.download.Download$ProgressBar r0 = r1.d     // Catch: java.lang.Throwable -> L18c
            r17 = 100
            r16 = r0
            r20 = r24
            r16.onProgress(r17, r18, r20)     // Catch: java.lang.Throwable -> L18c
            r5.renameTo(r3)     // Catch: java.lang.Throwable -> L18c
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L18c
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r26)
            return r0
        L1d7:
            r0 = move-exception
            r26 = r2
            goto L1e5
        L1db:
            r26 = r2
            xyz.adscope.common.network.exception.DownloadError r2 = new xyz.adscope.common.network.exception.DownloadError     // Catch: java.lang.Throwable -> L18c
            java.lang.String r3 = "The download policy prohibits the program from continuing to download."
            r2.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> L18c
            throw r2     // Catch: java.lang.Throwable -> L18c
        L1e5:
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r2)
            throw r0
        L1e9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Please specify the directory."
            r0.<init>(r2)
            throw r0
    }

    public abstract void cancel();
}
