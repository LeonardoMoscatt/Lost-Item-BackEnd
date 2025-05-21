package moscatt.corsi.mapper;

import moscatt.corsi.dto.LostItemCreateDTO;
import moscatt.corsi.dto.LostItemFoundUpdateDTO;
import moscatt.corsi.entities.Lostitem;

public class LostItemMapper {

    public static Lostitem fromCreateDto(LostItemCreateDTO dto) {
        Lostitem item = new Lostitem();
        item.setName(dto.getName());
        item.setDescription(dto.getDescription());
        item.setLostDate(dto.getLostDate());
        item.setLocation(dto.getLocation());
        item.setFound(false); // default
        item.setFoundDate(null);
        item.setFoundLocation(null);
        return item;
    }

    public static void updateFoundInfo(Lostitem item, LostItemFoundUpdateDTO dto) {
        item.setFound(dto.getFound());
        item.setFoundDate(dto.getFoundDate());
        item.setFoundLocation(dto.getFoundLocation());
    }
}
