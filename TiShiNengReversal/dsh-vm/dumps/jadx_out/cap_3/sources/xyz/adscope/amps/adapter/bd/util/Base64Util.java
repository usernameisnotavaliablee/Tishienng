package xyz.adscope.amps.adapter.bd.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Base64Util {
    public Base64Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap base64ToBitmap(java.lang.String r2) {
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Exception -> L14
            r0 = 2
            byte[] r2 = android.util.Base64.decode(r2, r0)     // Catch: java.lang.Exception -> L14
            int r0 = r2.length     // Catch: java.lang.Exception -> L14
            r1 = 0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)     // Catch: java.lang.Exception -> L14
            return r2
        L14:
            r2 = 0
            return r2
    }

    public static android.graphics.drawable.BitmapDrawable base64ToBitmapDrawable(java.lang.String r2) {
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Exception -> L19
            r0 = 2
            byte[] r2 = android.util.Base64.decode(r2, r0)     // Catch: java.lang.Exception -> L19
            int r0 = r2.length     // Catch: java.lang.Exception -> L19
            r1 = 0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)     // Catch: java.lang.Exception -> L19
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L19
            r0.<init>(r2)     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            r2 = 0
            return r2
    }
}
