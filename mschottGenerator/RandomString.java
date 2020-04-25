package mschottGenerator;

public class RandomString
{
    static String getAlphaNumericString(final int n) {
        final String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        final StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; ++i) {
            final int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}
