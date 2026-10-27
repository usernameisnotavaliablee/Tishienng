package com.bytedance.msdk.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt extends com.bytedance.sdk.component.oq.r.xt<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
    private java.lang.ref.SoftReference<android.widget.ImageView> xt;

    public xt(android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.xt = r0
            return
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r1) {
            r0 = this;
            java.lang.String[] r1 = (java.lang.String[]) r1
            android.graphics.Bitmap r1 = r0.j(r1)
            return r1
    }

    protected android.graphics.Bitmap j(java.lang.String... r4) {
            r3 = this;
            r0 = 0
            r4 = r4[r0]
            r0 = 0
            if (r4 != 0) goto L7
            return r0
        L7:
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L2b
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "GET"
            r4.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L2b
            r4.connect()     // Catch: java.lang.Throwable -> L2b
            int r1 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L2b
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L2d
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L2b
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L2b
            return r4
        L2b:
            r4 = move-exception
            goto L2e
        L2d:
            return r0
        L2e:
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r0
    }

    protected void j(android.graphics.Bitmap r2) {
            r1 = this;
            super.onPostExecute(r2)
            if (r2 == 0) goto L19
            java.lang.ref.SoftReference<android.widget.ImageView> r0 = r1.xt
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L18
            java.lang.ref.SoftReference<android.widget.ImageView> r0 = r1.xt
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r2)
        L18:
            return
        L19:
            java.lang.String r2 = "download Image"
            java.lang.String r0 = "Error download Image fail..."
            com.bytedance.msdk.j.up.cw.j(r2, r0)
            return
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(java.lang.Object r1) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.j(r1)
            return
    }
}
