package cn.jpush.android.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private static java.util.Queue<java.lang.Integer> a;

    static {
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            cn.jpush.android.x.f.a = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a() {
            java.util.Queue<java.lang.Integer> r0 = cn.jpush.android.x.f.a
            int r0 = r0.size()
            if (r0 <= 0) goto L15
            java.util.Queue<java.lang.Integer> r0 = cn.jpush.android.x.f.a
            java.lang.Object r0 = r0.poll()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public static boolean a(int r1) {
            java.util.Queue<java.lang.Integer> r0 = cn.jpush.android.x.f.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r0.offer(r1)
            return r1
    }

    public static int b() {
            java.util.Queue<java.lang.Integer> r0 = cn.jpush.android.x.f.a
            int r0 = r0.size()
            return r0
    }

    public static boolean b(int r1) {
            java.util.Queue<java.lang.Integer> r0 = cn.jpush.android.x.f.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r0.contains(r1)
            return r1
    }
}
