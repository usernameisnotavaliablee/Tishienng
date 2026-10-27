package i0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "com.google.android.gms.internal.mlkit_vision_pose_common.zzvm"
            javassist.CtClass r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "zza"
            javassist.CtMethod r1 = r0.getDeclaredMethod(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "{ System.out.println(\"Intercepted zzvm->zza method call\"); return false; }"
            r1.insertBefore(r2)     // Catch: java.lang.Throwable -> L23
            r0.writeFile()     // Catch: java.lang.Throwable -> L23
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "C:\\Android\\Code\\BoXinCampus\\student\\src\\main\\java\\com\\bxkj\\student\\v2\\ai\\fitness"
            r0.writeFile(r1)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @org.junit.Test
    public void b() {
            r0 = this;
            a()
            return
    }
}
