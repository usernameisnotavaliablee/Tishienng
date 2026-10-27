package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AndroidAppProcess extends cn.jiguang.commons.bean.AndroidProcess {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f963f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f964g = null;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f965d;

    /* renamed from: e, reason: collision with root package name */
    public final int f966e;

    public static final class a extends java.lang.Exception {
        public a(int r3) {
                r2 = this;
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r3
                java.lang.String r3 = "The process %d does not belong to any application"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                r2.<init>(r3)
                return
        }
    }

    static {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/dev/cpuctl/tasks"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            cn.jiguang.commons.bean.AndroidAppProcess.f963f = r0
            java.lang.String r0 = "^([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:])*[A-Za-z][A-Za-z0-9_]*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            cn.jiguang.commons.bean.AndroidAppProcess.f964g = r0
            return
    }

    public AndroidAppProcess(int r6) {
            r5 = this;
            r5.<init>(r6)
            java.lang.String r0 = r5.a
            if (r0 == 0) goto L90
            java.util.regex.Pattern r1 = cn.jiguang.commons.bean.AndroidAppProcess.f964g
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L90
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.h()
            java.lang.String r2 = "/data/data"
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L90
            boolean r0 = cn.jiguang.commons.bean.AndroidAppProcess.f963f
            r1 = 1
            if (r0 == 0) goto L76
            cn.jiguang.commons.bean.Cgroup r0 = r5.a()
            java.lang.String r2 = "cpuacct"
            cn.jiguang.commons.bean.ControlGroup r2 = r0.c(r2)
            java.lang.String r3 = "cpu"
            cn.jiguang.commons.bean.ControlGroup r0 = r0.c(r3)
            if (r0 == 0) goto L70
            if (r2 == 0) goto L70
            java.lang.String r3 = r2.f974d
            java.lang.String r4 = "pid_"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L70
            java.lang.String r6 = r0.f974d
            java.lang.String r0 = "bg_non_interactive"
            boolean r6 = r6.contains(r0)
            r6 = r6 ^ r1
            java.lang.String r0 = r2.f974d     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = "/"
            java.lang.String[] r0 = r0.split(r2)     // Catch: java.lang.Throwable -> L67
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "uid_"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L67
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L67
            goto L8b
        L67:
            cn.jiguang.commons.bean.Status r0 = r5.g()
            int r0 = r0.a()
            goto L8b
        L70:
            cn.jiguang.commons.bean.AndroidAppProcess$a r0 = new cn.jiguang.commons.bean.AndroidAppProcess$a
            r0.<init>(r6)
            throw r0
        L76:
            cn.jiguang.commons.bean.Stat r6 = r5.f()
            cn.jiguang.commons.bean.Status r0 = r5.g()
            int r6 = r6.f()
            if (r6 != 0) goto L85
            goto L86
        L85:
            r1 = 0
        L86:
            int r0 = r0.a()
            r6 = r1
        L8b:
            r5.f965d = r6
            r5.f966e = r0
            return
        L90:
            cn.jiguang.commons.bean.AndroidAppProcess$a r0 = new cn.jiguang.commons.bean.AndroidAppProcess$a
            r0.<init>(r6)
            throw r0
    }

    public java.lang.String h() {
            r2 = this;
            java.lang.String r0 = r2.a
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            r1 = 0
            r0 = r0[r1]
            return r0
    }
}
