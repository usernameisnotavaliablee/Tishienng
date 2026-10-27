package com.ss.android.downloadlib.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {

    static class a implements com.ss.android.downloadlib.up.b.InterfaceC0221b<java.lang.Void> {
        final /* synthetic */ java.lang.Runnable a;

        a(java.lang.Runnable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.Void a() {
                r1 = this;
                java.lang.Runnable r0 = r1.a
                r0.run()
                r0 = 0
                return r0
        }

        @Override // com.ss.android.downloadlib.up.b.InterfaceC0221b
        public /* synthetic */ java.lang.Void xt() {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
        }
    }

    /* renamed from: com.ss.android.downloadlib.up.b$b, reason: collision with other inner class name */
    public interface InterfaceC0221b<T> {
        T xt();
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> T a(com.ss.android.downloadlib.up.b.InterfaceC0221b<T> r2) {
            r0 = 1
            r1 = 0
            java.lang.Object r2 = b(r0, r1, r2)
            return r2
    }

    public static <T> T b(boolean r1, java.lang.String r2, @androidx.annotation.NonNull com.ss.android.downloadlib.up.b.InterfaceC0221b<T> r3) {
            java.lang.Object r1 = r3.xt()     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r3 = move-exception
            boolean r0 = r3 instanceof com.ss.android.downloadlib.up.j
            if (r0 != 0) goto L1a
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
            r0.e(r1, r3, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L19
            r1 = 0
            return r1
        L19:
            throw r3
        L1a:
            throw r3
    }

    public static void c(java.lang.Runnable r1) {
            com.ss.android.downloadlib.up.b$a r0 = new com.ss.android.downloadlib.up.b$a
            r0.<init>(r1)
            a(r0)
            return
    }
}
