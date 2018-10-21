
package mage.abilities.keyword;

import mage.abilities.StaticAbility;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Zone;

/**
 *
 * @author L_J
 */
public class BandsWithOtherAbility extends StaticAbility {

    private SubType subtype;
    private SuperType supertype;
    private String name;

    public BandsWithOtherAbility() {
        this(null, null, null);
    }

    public BandsWithOtherAbility(SubType subtype) {
        this(subtype, null, null);
    }

    public BandsWithOtherAbility(SuperType supertype) {
        this(null, supertype, null);
    }

    public BandsWithOtherAbility(String name) {
        this(null, null, name);
    }

    public BandsWithOtherAbility(SubType subtype, SuperType supertype, String name) {
        super(Zone.ALL, null);
        this.subtype = subtype;
        this.supertype = supertype;
        this.name = name;
    }

    public BandsWithOtherAbility(BandsWithOtherAbility ability) {
        super(ability);
        this.subtype = ability.subtype;
        this.supertype = ability.supertype;
        this.subtype = ability.subtype;
    }

    @Override
    public BandsWithOtherAbility copy() {
        return new BandsWithOtherAbility(this);
    }

    public SubType getSubtype() {
        return subtype;
    }

    public SuperType getSupertype() {
        return supertype;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getRule() {
        StringBuilder sb = new StringBuilder("bands with other");
        if (subtype != null) {
            return sb.append(' ').append(subtype.getDescription()).append('s').toString();
        } else if (supertype != null) {
            return sb.append(' ').append(supertype.toString()).append('s').toString();
        } else if (name != null) {
            return sb.append(" creatures named ").append(name).toString();
        }
        return "all \"" + sb.toString() + "\" abilities";
    }

}
