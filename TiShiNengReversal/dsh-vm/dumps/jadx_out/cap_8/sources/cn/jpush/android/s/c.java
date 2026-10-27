package cn.jpush.android.s;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private android.os.CountDownTimer a;


    public interface a {
        void a();
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public void a() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.a
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.a = r0
        La:
            return
    }

    public void a(cn.jpush.android.s.c.a r8, long r9, long r11) {
            r7 = this;
            cn.jpush.android.s.c$1 r0 = new cn.jpush.android.s.c$1
            r1 = r7
            r6 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r4, r6)
            android.os.CountDownTimer r8 = r0.start()
            r1.a = r8
            return
    }
}
