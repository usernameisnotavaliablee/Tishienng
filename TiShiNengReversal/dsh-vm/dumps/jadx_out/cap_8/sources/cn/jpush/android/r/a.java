package cn.jpush.android.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {



    /* renamed from: cn.jpush.android.r.a$a, reason: collision with other inner class name */
    public interface InterfaceC0054a {
        void a();
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.view.View r1, android.graphics.Point r2, long r3, cn.jpush.android.r.a.InterfaceC0054a r5) {
            if (r1 != 0) goto La
            java.lang.String r1 = "InAppAnimator"
            java.lang.String r2 = "[slideOutOfView] view is null"
            cn.jpush.android.helper.Logger.w(r1, r2)
            return
        La:
            android.view.ViewPropertyAnimator r1 = r1.animate()
            int r0 = r2.x
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r1 = r1.translationX(r0)
            int r2 = r2.y
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            cn.jpush.android.r.a$1 r2 = new cn.jpush.android.r.a$1
            r2.<init>(r5)
            r1.setListener(r2)
            return
    }

    public static void a(android.view.View r6, android.graphics.Point r7, android.graphics.Point r8, long r9, cn.jpush.android.r.a.InterfaceC0054a r11) {
            if (r6 != 0) goto La
            java.lang.String r6 = "InAppAnimator"
            java.lang.String r7 = "[slideIntoView] view is null"
            cn.jpush.android.helper.Logger.w(r6, r7)
            return
        La:
            r0 = 0
            r6.setAlpha(r0)
            android.view.ViewPropertyAnimator r0 = r6.animate()
            int r1 = r7.x
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
            int r7 = r7.y
            float r7 = (float) r7
            android.view.ViewPropertyAnimator r7 = r0.translationY(r7)
            r0 = 10
            android.view.ViewPropertyAnimator r7 = r7.setDuration(r0)
            cn.jpush.android.r.a$2 r0 = new cn.jpush.android.r.a$2
            r1 = r6
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            r7.setListener(r0)
            return
    }
}
