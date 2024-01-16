package exercise;

// BEGIN
public class LabelTag implements TagInterface  {
    String label;
    TagInterface inputTag;

    public LabelTag(String label, TagInterface inputTag) {
        this.label = label;
        this.inputTag = inputTag;
    }

    @Override
    public String render() {
        return "<label>" + label + this.inputTag.render() + "</label>";
    }
}
// END
