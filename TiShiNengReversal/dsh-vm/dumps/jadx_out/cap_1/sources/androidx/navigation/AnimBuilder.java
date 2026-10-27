package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavOptionsDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AnimBuilder {

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int enter;

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int exit;

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int popEnter;

    @androidx.annotation.AnimRes
    @androidx.annotation.AnimatorRes
    private int popExit;

    public AnimBuilder() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.enter = r0
            r1.exit = r0
            r1.popEnter = r0
            r1.popExit = r0
            return
    }

    public final int getEnter() {
            r1 = this;
            int r0 = r1.enter
            return r0
    }

    public final int getExit() {
            r1 = this;
            int r0 = r1.exit
            return r0
    }

    public final int getPopEnter() {
            r1 = this;
            int r0 = r1.popEnter
            return r0
    }

    public final int getPopExit() {
            r1 = this;
            int r0 = r1.popExit
            return r0
    }

    public final void setEnter(int r1) {
            r0 = this;
            r0.enter = r1
            return
    }

    public final void setExit(int r1) {
            r0 = this;
            r0.exit = r1
            return
    }

    public final void setPopEnter(int r1) {
            r0 = this;
            r0.popEnter = r1
            return
    }

    public final void setPopExit(int r1) {
            r0 = this;
            r0.popExit = r1
            return
    }
}
