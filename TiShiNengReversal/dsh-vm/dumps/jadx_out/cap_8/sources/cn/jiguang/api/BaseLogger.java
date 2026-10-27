package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BaseLogger {
    public BaseLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void flushCached2File() {
            return
    }

    private void log(int r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.Throwable r11) {
            r6 = this;
            java.lang.String r1 = r6.getCommonTag()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 4
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r0 = 0
            r5[r0] = r7
            r7 = 1
            r5[r7] = r8
            r7 = 2
            r5[r7] = r10
            r7 = 3
            r5[r7] = r11
            r0 = 0
            r2 = 18
            r4 = 0
            r3 = r9
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public void _d(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            return
    }

    public void d(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 1
            r5 = 0
            r1 = 3
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void d(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 3
            r2 = 1
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void dd(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 0
            r5 = 0
            r1 = 3
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void dd(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 3
            r2 = 0
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void e(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 1
            r5 = 0
            r1 = 6
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void e(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 6
            r2 = 1
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void ee(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 0
            r5 = 0
            r1 = 6
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void ee(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 6
            r2 = 0
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public abstract java.lang.String getCommonTag();

    public void i(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 1
            r5 = 0
            r1 = 4
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void i(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 4
            r2 = 1
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void ii(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 0
            r5 = 0
            r1 = 4
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void ii(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 4
            r2 = 0
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void v(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 1
            r5 = 0
            r1 = 2
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void v(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 2
            r2 = 1
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void vv(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 0
            r5 = 0
            r1 = 2
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void vv(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 2
            r2 = 0
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void w(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 1
            r5 = 0
            r1 = 5
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void w(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 5
            r2 = 1
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void ww(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r2 = 0
            r5 = 0
            r1 = 5
            r0 = r6
            r3 = r7
            r4 = r8
            r0.log(r1, r2, r3, r4, r5)
            return
    }

    public void ww(java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            r1 = 5
            r2 = 0
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.log(r1, r2, r3, r4, r5)
            return
    }
}
