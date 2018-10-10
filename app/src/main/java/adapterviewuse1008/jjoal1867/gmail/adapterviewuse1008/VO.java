package adapterviewuse1008.jjoal1867.gmail.adapterviewuse1008;

//아이폰이나 안드로이드 같은 모바일 프로그래밍에서 데이터를 나타내는 클래스를 만들때
//c언어의 구조체형태로 많이 만든다. why? 객체지향의 디자인 패턴을 적용하면 부피가 커지고 복잡해질 수도 있기 때문이다.
public class VO {
    public int icon;
    public String name;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
