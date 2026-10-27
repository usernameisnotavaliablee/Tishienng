package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TableLayoutBindingAdapter {
    private static final int MAX_COLUMNS = 20;
    private static java.util.regex.Pattern sColumnPattern;

    static {
            java.lang.String r0 = "\\s*,\\s*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.databinding.adapters.TableLayoutBindingAdapter.sColumnPattern = r0
            return
    }

    public TableLayoutBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.util.SparseBooleanArray parseColumns(java.lang.CharSequence r5) {
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            if (r5 != 0) goto L8
            goto L21
        L8:
            java.util.regex.Pattern r1 = androidx.databinding.adapters.TableLayoutBindingAdapter.sColumnPattern
            java.lang.String[] r5 = r1.split(r5)
            int r1 = r5.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L21
            r3 = r5[r2]
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L1e
            if (r3 < 0) goto L1e
            r4 = 1
            r0.put(r3, r4)     // Catch: java.lang.NumberFormatException -> L1e
        L1e:
            int r2 = r2 + 1
            goto L10
        L21:
            return r0
    }

    @androidx.databinding.BindingAdapter({"android:collapseColumns"})
    public static void setCollapseColumns(android.widget.TableLayout r4, java.lang.CharSequence r5) {
            android.util.SparseBooleanArray r5 = parseColumns(r5)
            r0 = 0
            r1 = 0
        L6:
            r2 = 20
            if (r1 >= r2) goto L1a
            boolean r2 = r5.get(r1, r0)
            boolean r3 = r4.isColumnCollapsed(r1)
            if (r2 == r3) goto L17
            r4.setColumnCollapsed(r1, r2)
        L17:
            int r1 = r1 + 1
            goto L6
        L1a:
            return
    }

    @androidx.databinding.BindingAdapter({"android:shrinkColumns"})
    public static void setShrinkColumns(android.widget.TableLayout r4, java.lang.CharSequence r5) {
            r0 = 0
            if (r5 == 0) goto L16
            int r1 = r5.length()
            if (r1 <= 0) goto L16
            char r1 = r5.charAt(r0)
            r2 = 42
            if (r1 != r2) goto L16
            r5 = 1
            r4.setShrinkAllColumns(r5)
            return
        L16:
            r4.setShrinkAllColumns(r0)
            android.util.SparseBooleanArray r5 = parseColumns(r5)
            int r1 = r5.size()
        L21:
            if (r0 >= r1) goto L33
            int r2 = r5.keyAt(r0)
            boolean r3 = r5.valueAt(r0)
            if (r3 == 0) goto L30
            r4.setColumnShrinkable(r2, r3)
        L30:
            int r0 = r0 + 1
            goto L21
        L33:
            return
    }

    @androidx.databinding.BindingAdapter({"android:stretchColumns"})
    public static void setStretchColumns(android.widget.TableLayout r4, java.lang.CharSequence r5) {
            r0 = 0
            if (r5 == 0) goto L16
            int r1 = r5.length()
            if (r1 <= 0) goto L16
            char r1 = r5.charAt(r0)
            r2 = 42
            if (r1 != r2) goto L16
            r5 = 1
            r4.setStretchAllColumns(r5)
            return
        L16:
            r4.setStretchAllColumns(r0)
            android.util.SparseBooleanArray r5 = parseColumns(r5)
            int r1 = r5.size()
        L21:
            if (r0 >= r1) goto L33
            int r2 = r5.keyAt(r0)
            boolean r3 = r5.valueAt(r0)
            if (r3 == 0) goto L30
            r4.setColumnStretchable(r2, r3)
        L30:
            int r0 = r0 + 1
            goto L21
        L33:
            return
    }
}
