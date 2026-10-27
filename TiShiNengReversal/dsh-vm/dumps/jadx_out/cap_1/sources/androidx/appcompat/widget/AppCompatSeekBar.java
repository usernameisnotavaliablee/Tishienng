package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AppCompatSeekBar extends android.widget.SeekBar {
    private final androidx.appcompat.widget.AppCompatSeekBarHelper mAppCompatSeekBarHelper;

    public AppCompatSeekBar(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatSeekBar(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.seekBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatSeekBar(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r0, r1)
            androidx.appcompat.widget.AppCompatSeekBarHelper r1 = new androidx.appcompat.widget.AppCompatSeekBarHelper
            r1.<init>(r0)
            r0.mAppCompatSeekBarHelper = r1
            r1.loadFromAttributes(r2, r3)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = r1.mAppCompatSeekBarHelper
            r0.drawableStateChanged()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = r1.mAppCompatSeekBarHelper
            r0.jumpDrawablesToCurrentState()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: java.lang.Throwable -> Lb
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = r1.mAppCompatSeekBarHelper     // Catch: java.lang.Throwable -> Lb
            r0.drawTickMarks(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
